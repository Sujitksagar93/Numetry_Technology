
import './App.css';
import { useEffect, useState } from 'react';

function App() {

  const [data , setData] = useState([])

  const url ="http://localhost:9090/students"
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
      <div >
      <h2>Student Details Table</h2>
      <table className='table-primary'>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>RollNo</th>
          </tr>
        </thead>
        <tbody className='a'>
        {
        data.map((item,index) => {
          return <tr key={index}>
            <td>{item.id}</td>
            <td>{item.name}</td>
            <td>{item.age}</td>
            <td>{item.rollNo}</td>
          </tr>
          
        })
} 
        </tbody>
      </table>
</div>

           
          </div>
  );
}

export default App;
