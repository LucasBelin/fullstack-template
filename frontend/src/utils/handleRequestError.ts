export default function handleRequestError(error: unknown): void {
  if (error instanceof Error) {
    console.log(error.message)
  }

  console.log("An unknown error occurred")
}
