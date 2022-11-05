import axios from "axios"
import { z } from "zod"

const textValidator = z.object({
  id: z.number(),
  text: z.string(),
})

export type Text = z.infer<typeof textValidator>

const textArrayValidator = z.array(textValidator)

export const getTexts = async (): Promise<Text[]> => {
  return axios
    .get("http://localhost:8080/api/text")
    .then(res => {
      return textArrayValidator.parse(res.data)
    })
    .catch(err => {
      console.log(err)
      throw err
    })
}

export const postText = async (text: string) => {
  return axios
    .post("http://localhost:8080/api/text", { text })
    .then(res => {
      return textValidator.parse(res.data)
    })
    .catch(err => {
      console.log(err)
    })
}

export const updateText = async ({ id, text }: Text) => {
  return axios
    .put(`http://localhost:8080/api/text`, {
      id,
      text,
    })
    .then(res => {
      return textValidator.parse(res.data)
    })
    .catch(err => {
      console.log(err)
    })
}

export const deleteText = async (id: number) => {
  return axios.delete(`http://localhost:8080/api/text/${id}`).catch(err => {
    console.log(err)
  })
}
