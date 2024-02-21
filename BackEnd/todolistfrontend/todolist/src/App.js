
import './App.css';
import { useEffect, useState } from 'react';
function App() {

  const [data , setData] = useState([])

const url ="http://localhost:9090/lists" 
useEffect( ()=> {
  fetch(url)
  .then(response => response.json()).then(json =>{
    console.log("json",json)
    setData(json)
  }).catch(e => {
    console.log("e",e)
  })
},[])

  return (
    <div className="container"  >
      
      <h2>ToDoList</h2>
      <table className='abc'>
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
          </tr>
        </thead>
        <tbody className=''>
        {
        data.map((item,index) => {
          return <tr key={index}>
            <td>{item.id}</td>
            
            <td>{item.title}</td>
          </tr>
          
        })
} 
        </tbody>
      </table>
</div>

  );
}

export default App;
