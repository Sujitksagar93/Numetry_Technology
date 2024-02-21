import axios from 'axios';
import React, {useState} from "react";
import './StudentRegister.css';

export default function StudentRegister() {
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
            schoolName :"",
            grade :"",
            date :"",
            parentName:"",
            address :"",
            address1 :"",
            city :"",
            state :"",
            zipcode :"",
            mobile :"",
            email : ""
        });
        
        const {studentName , schoolName,grade,date ,parentName,address,address1,city,state,zipcode,mobile,email} = user;

        const onInputchange = (e) => {
            setUser ({...user, [e.target.name] : e.target.value});
        }

        const onSubmit = async (e) =>{
            e.preventDefault();
            console.log(studentName);
            console.log(schoolName);
            await axios.post("http://localhost:9090/save",user)
            alert("Student register Successfully");
        };

    return (
        <div className="App">

            <div className="container">
            <div className='col-xl-5 a'></div>
            <div className='col-xl-5 a aa'>
            <div className='heading col-xl-6'>
                    <h1 className='name'>School Transportation</h1>
                </div><br></br>
                <form onSubmit={(e) => onSubmit(e)}>
                    <div className='form-group col-xl-6'>
                        <lable class="lable1"htmlFor="Name">Student Name</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="studentName"
                        value={studentName} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-6 row' >
                    <div className='form-group col-xl-6'>
                        <lable class="lable2"htmlFor="schoolName">School Name</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="schoolName"
                        value={schoolName} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-3'>
                        <lable class="lable3" htmlFor="grade ">Grade</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="grade"
                        value={grade} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-3'>
                        <lable class="lable4"htmlFor="date">Date to begin</lable>
                        <input 
                        type={"date"} 
                        className="form-control" 
                        required
                        name="date"
                        value={date} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    </div>
                    <div className='form-group col-xl-6'>
                        <lable class="lable5" htmlFor="parent">Parent/Guardian Name</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="parentName"
                        value={parentName} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-6'>
                        <lable class="lable6" htmlFor="address">Address</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="address"
                        value={address} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-6'>
                        <lable class="lable6"htmlFor="address1">Address1</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="address1"
                        value={address1} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-9 row' >
                    <div className='form-group col-xl-5'>
                        <lable class="lable7" htmlFor="city">City</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="city"
                        value={city} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-3'>
                        <lable class="lable3"htmlFor="stste">State</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="state"
                        value={state} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    </div>
                    <div className='form-group col-xl-9 row' >
                    <div className='form-group col-xl-3'>
                        <lable class="lable8" htmlFor="zipcode">Zipcode</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="zipcode"
                        value={zipcode} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <div className='form-group col-xl-4'>
                        <lable class="lable4"htmlFor="mobile">Phone Number</lable>
                        <input 
                        type={"text"} 
                        className="form-control" 
                        required
                        name="mobile"
                        value={mobile} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    </div>
                    <div className='form-group col-xl-6'>
                        <lable class="lable9"htmlFor="email" >Email Address</lable>
                        <input 
                        type={"text"} 
                        required
                        className="form-control" 
                       
                        name="email"
                        value={email} onChange={(e) => onInputchange(e)}
                        ></input>
                    </div>
                    <br></br>

                <button  type="submit" class="btn btn-primary"  >Register</button>
                </form>
            </div>
            <div className='col-xl-5 a'></div>
            </div>

        </div>
    );
}

//export default StudentRegister;