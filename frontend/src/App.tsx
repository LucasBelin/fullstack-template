import { useEffect } from "react"

function App() {
  useEffect(() => {
    fetch("http://localhost:8080/api/text/2")
      .then(res => res.json())
      .then(data => console.log(data))
      .catch(err => console.log(err))
  }, [])

  return (
    <div className="h-screen w-screen flex justify-center items-center">
      <h1 className="text-black font-bold text-3xl">Hello World</h1>
    </div>
  )
}

export default App
