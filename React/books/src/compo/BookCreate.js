import {useState} from 'react';
import useBookContext from '../hooks/useBookContext';

function BookCreate()
{
    const [title,setTtitle] = useState('');
    const {createBook} = useBookContext();
    
    const handleChange=(event)=>{
        setTtitle(event.target.value);
    }

    const handleSubmit =(event)=>{
        event.preventDefault(); //prevent default or automatic  submission of page 
       createBook(title);
        setTtitle('');
    }
    return (
        <div className="book-create">
            <h3>Add To List</h3>
            <form onSubmit={handleSubmit}>
                
                <input className="input" value ={title} onChange={handleChange}/>
                <div> 
                    <button className="button">Submit</button>
                </div>
            </form>
        </div>
    )
}

export default BookCreate;