import React from 'react'

const border = ({children}) => {
  return (
    <div>
      <div style={{border:"2px solid red",backgroundColor:"steelblue",height:"150px",width:"120px",display:"flex",justifyContent:"center",alignItems:"center"}}>{children}</div>
    </div>
  )
}
export default border
