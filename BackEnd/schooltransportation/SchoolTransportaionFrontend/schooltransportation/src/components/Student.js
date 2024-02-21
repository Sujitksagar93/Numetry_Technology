import axios from 'axios';
import React, {useState} from "react";

export default function Student() {
   /*
   const[studentName , setStudentName]= useState("");
   const[schoolName , setSchoolName]= useState("");
   const[grade , setGrade]= useState("");
   const[date , setDate]= useState("");
   const[ parentName, setParentName]= useState("");
   const[address , setAddress]= useState("");
   const[ address1, setAddress1]= useState("");
   const[city , setCity]= useState("");
   const[ state, setState]= useState("");
   const[zipcode , setZipcode]= useState("");
   const[mobile , setMobile]= useState("");
   const[ email, setEmail]= useState("");
   
   

    async function save(event)
    {
        event.preventDefault();
        

        try{
            await axios.post("localhost:9090/save",
            
           {
            studentName:studentName,
            schoolName: schoolName,
            grade :grade,
            date :date,
            parentName :parentName,
            address :address,
            address1 :address1,
            city :city,
            state :state,
            zipcode :zipcode,
            mobile :mobile,
            email : email
            });
            alert("Student register Successfully");
            setStudentName("");
            setSchoolName("");
            setGrade("");
            setDate("");
            setParentName("");
            setAddress("");
            setAddress1("");
            setCity("");
            setState("");
            setZipcode("");
            setMobile("");
            setEmail("");
            
        }
        catch(err){
            alert("Student register failed");
            
        }
        }

*/

        const [user , setUser] = useState({
            studentName :"",
            schoolName :""
        });
        
        const {studentName , schoolName} = user;

        const onInputchange = (e) => {
            setUser ({...user, [e.target.name] : e.target.value});
        }

        const onSubmit = async (e) =>{
            e.preventDefault();
            console.log(studentName);
            console.log(schoolName);
            await axios.post("http://localhost:9090/save",user)
        };

    return (
        <div className="App">

            <div className="container">
                <form onSubmit={(e) => onSubmit(e)}>
                    <div className='form-group'>
                        <lable htmlFor="Name">Student Name</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        placeholder="Enter name"
                        name="studentName"
                        value={studentName} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group'>
                        <lable htmlFor="sname">School Name</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        placeholder="Enter name"
                        name="schoolName"
                        value={schoolName} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                   
                    

                <button  type="submit" class="btn btn-primary" >Register</button>
                </form>
            </div>

        </div>
    );
}

//export default Student;