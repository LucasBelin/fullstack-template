import axios from "axios"
import { useQuery } from "react-query"
import handleRequestError from "../utils/handleRequestError"

function TextComponent() {
  const { isLoading, isError, error, data } = useQuery("text", () =>
    axios.get("http://localhost:8080/api/text"),
  )

  if (isLoading) return <div className="text-white">Loading...</div>
  if (isError) {
    handleRequestError(error)
  }

  return (
    <div className="flex flex-col gap-2">
      <h2 className="text-white text-2xl font-medium">Texts in database :</h2>
      <ul className="list-disc ml-12">
        {data?.data.map((text: any) => (
          <li className="text-white text-lg" key={text.id}>
            {text.text}
          </li>
        ))}
      </ul>
    </div>
  )
}

export default TextComponent
