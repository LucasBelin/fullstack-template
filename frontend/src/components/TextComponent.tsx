import { useEffect, useRef, useState } from "react"
import { deleteText, getTexts, postText, Text } from "../services/text-service"

function TextComponent() {
  const [texts, setTexts] = useState<Text[]>([])
  const [isLoading, setIsLoading] = useState(true)
  const inputTextRef = useRef<HTMLInputElement>(null)

  const fetchTexts = async () => {
    setIsLoading(true)
    const data = await getTexts()
    setTexts(data)
    setIsLoading(false)
  }

  const addText = async (text: string) => {
    if (text.length === 0) return
    const createdText = await postText(text)
    createdText && setTexts([...texts, createdText])
  }

  const removeText = async (id: number) => {
    await deleteText(id)
    setTexts(texts.filter(text => text.id !== id))
  }

  useEffect(() => {
    fetchTexts()
  }, [])

  if (isLoading) return <div className="text-white">Loading...</div>

  return (
    <div className="flex gap-10">
      <div>
        <h2 className="text-white text-2xl font-medium mb-4 text-center">
          Texts in database :
        </h2>
        <div className="max-h-64 overflow-y-auto min-w-[500px] scrollbar-thin scrollbar-thumb-white hover:scrollbar-thumb-slate-300">
          <ul className="list-decimal ml-8 flex flex-col gap-2">
            {texts?.map(text => (
              <div className="flex px-3 gap-3" key={text.id}>
                <li className="text-white text-lg flex-grow">
                  <span className="max-w-xs truncate">{text.text}</span>
                </li>
                <button
                  onClick={() => {
                    removeText(text.id)
                  }}
                  className="text-red-600 mr-2"
                >
                  &#10005;
                </button>
              </div>
            ))}
          </ul>
        </div>
      </div>
      <div className="border-l border-gray-600 h-80" />
      <div className="flex flex-col gap-2">
        <button
          onClick={() => {
            addText(Math.random().toString(36).substring(7))
          }}
          className="btn mb-10"
        >
          Post random text
        </button>

        <div className="flex gap-2">
          <div className="relative">
            <input
              type="text"
              id="text-input"
              ref={inputTextRef}
              className="text-input peer"
              placeholder=" "
            />
            <label htmlFor="text-input" className="text-input-label">
              Enter some text
            </label>
          </div>
          <button
            className="btn"
            onClick={() => {
              if (inputTextRef.current) {
                addText(inputTextRef.current.value)
                inputTextRef.current.value = ""
              }
            }}
          >
            Post
          </button>
        </div>
      </div>
    </div>
  )
}

export default TextComponent
