import {useState} from 'react';
import BookEdit from "./BookEdit";
import useBookContext from "../hooks/useBookContext";

function BookShow({book})
{   
    const {deleteBook} = useBookContext();

    const [edit,setEdit] = useState(false);

    const handleClick = () =>{
        deleteBook(book.id);
    }
    const handleEdit = () =>{
        setEdit(!edit);
    };
    const handleSubmit = () =>{
            setEdit(false);
            
    }

    let content =<h3>{book.title}</h3>
    if(edit)
    {
        content=<BookEdit onSubmit ={handleSubmit}  book={book}/>;
    } 
    return (<div className="book-show">
        <img 
            alt = "Books"
            src={`https://picsum.photos/seed/${book.id}/300/200`}
        />
        <div>{content}</div>
        <div className='actions'>
            <button className="edit" onClick={handleEdit}>Edit</button>
            <button className="delete" onClick={handleClick}>Delete</button>
        </div>
        </div>)
}

export default BookShow