import React from 'react'
import Greetings from './Greetings'
import ClassGreeting from './ClassGreeting'
import Card from './Card'
const App = () => {
return (
 <>
 <Card children="asdf"/>
 <ClassGreeting name = "Aditya"/>
 <ClassGreeting />
 <Card children="qwerty">
 <Greetings name="Polaris"/>
 <Greetings />
 </Card>


 </>
)
}
export default App
