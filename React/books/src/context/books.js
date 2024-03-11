import { createContext,useState,useCallback } from "react";
import axios from "axios";

const BooksContext = createContext();

function Provider({children}){
    const [books,setBooks] = useState([]);

    const fetchBook = useCallback(async() =>{
        const response = await axios.get('http://localhost:3001/book');
        setBooks(response.data);
    },[]);

    const onEditBook =async(id,newTitle)=>{
        const response = await axios.put(`http://localhost:3001/book/${id}`,{
            title: newTitle
        })
        const updateBooks = books.map((book)=>{
            if(book.id===id)
            {
                return {...book,...response.data}
            }
            return book;
        })
        setBooks(updateBooks);
    }

    const deleteBook = async(id)=>{
        await axios.delete(`http://localhost:3001/book/${id}`);

        const updatedBooks = books.filter((book) =>{
            return book.id!==id;
        })
        setBooks(updatedBooks)
    }

    const createBook =async(title) =>{
        const response = await axios.post('http://localhost:3001/book',{
            title,
        });
       const updatedBook = [
        ...books,
        response.data
       ]
       setBooks(updatedBook)
    }

    const valueToShare = {
        books,
        onEditBook,
        deleteBook,
        createBook,
        fetchBook
    };
    return(
        <BooksContext.Provider value={valueToShare}>
            {children}
        </BooksContext.Provider>
    )
}

export {Provider};
export default BooksContext;    