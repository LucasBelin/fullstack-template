import { QueryClient, QueryClientProvider } from "react-query"
import TextComponent from "./components/TextComponent"

function App() {
  return (
    <QueryClientProvider client={new QueryClient()}>
      <div className="h-screen w-screen flex items-center flex-col bg-slate-900 pt-28 gap-28">
        <h1 className="text-white font-bold text-3xl mb-5">Hello World</h1>
        <TextComponent />
      </div>
    </QueryClientProvider>
  )
}

export default App
