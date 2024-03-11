import { useState } from 'react';
import useBookContext from '../hooks/useBookContext';

function BookEdit({book,onSubmit})
{
    const [title,setTitle] = useState(book.title);
    const {onEditBook} = useBookContext();

    const handleChange =(event)=>{
        setTitle(event.target.value);
    }
    const handleSubmit = (event) =>{
        event.preventDefault();
        
        onSubmit();
        onEditBook(book.id,title);
    }
    return (
        <form className="book-edit" onSubmit ={handleSubmit}>
            <label>Title</label>
            <input className="input" value={title} onChange={handleChange}></input>
            <button className="button is-primary" >Save</button>
        </form>
    )
}

export default BookEdit;