import BookShow from "./Booksho";
import useBookContext from "../hooks/useBookContext";

function BookList()
{
    const {books} = useBookContext();
    const renderedBook = books.map((book)=>{
        return <BookShow key={book.id} book={book} />
    })
    return (
        <div className ="book-list">
            {renderedBook}
        </div>
    )
}

export default BookList; 