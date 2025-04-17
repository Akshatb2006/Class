import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Greeting from './components/Greetings.jsx'
import respectfulGreet from './components/respectfulGreet.jsx'

function App() {
  const NewGreet = respectfulGreet(Greeting)
  return (
    <div>
      {/* <Greeting name="John" age={109}/> */}
      <NewGreet name="John" age={109}/>
    </div>
  )
}

export default App
