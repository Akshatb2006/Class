
import React from 'react'
const Card = ({children}) => {
return (
 <div style={{border:'2px solid black',
backgroundColor:'blue',color:'white',height:'150px',width:'75vw'
}}>
 {children}
 </div>
)
}
export default Card