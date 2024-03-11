import {useEffect,useContext} from 'react'
import BookCreate from './compo/BookCreate';
import BookList from './compo/BookList';
import BooksContext from './context/books';


function App(){

    const {fetchBook} = useContext(BooksContext);
    useEffect(()=>{
        fetchBook();
    },[fetchBook]);
    

    return (
        <div className = "app">
            <h1>TODO List</h1>
            <BookList />
            <BookCreate />
            
        </div>
        )
}

export default App;