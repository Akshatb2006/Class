import React from 'react'

const respectfulGreet = (PassedComponent) => {
    function NewComponent(props) {
        return (
            <div>
                <>Hello, sir</>
                <PassedComponent {...props} />
                <>Have a nice day</>
            </div>
        )
    }
  return NewComponent
}

export default respectfulGreet