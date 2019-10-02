import React, { useState } from 'react'
import ReactDOM from 'react-dom'

const App = (props) => {
  const [selected, setSelected] = useState(0)
  const [pisteet, setPisteet] = useState({
    0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0
  })
  const [maxVote, setMaxVote] = useState(0)

  const handleCopyPoints = () => {
    pisteet[selected] += 1;
    setPisteet({...pisteet})
    
    const maxVote = Object.keys(pisteet).reduce((a, b) => pisteet[a] > pisteet[b] ? a : b);

    setMaxVote(maxVote)
}   

return (
    <div>
        <h1>Anecdote of the day</h1>
        <p>{props.anecdotes[selected]}</p>
        <p>has {pisteet[selected]} votes</p>
        <Button onClick={handleCopyPoints} text='Vote'></Button> 
        <Button onClick={ () => setSelected(Math.floor(Math.random() * anecdotes.length))} text='Next anecdote'></Button>
        <h1>Anecdotes with most votes</h1>
        <MostVoted winner={maxVote} anecdotes={anecdotes}/>
    </div>
  )
}

const Button = ({onClick, text}) => (
    <button onClick={onClick}>
      {text}
    </button>
)

const MostVoted = (props) => {
  return (
      <div>
        {anecdotes[props.winner]}
      </div>
  )
}

const anecdotes = [
  'If it hurts, do it more often',
  'Adding manpower to a late software project makes it later!',
  'The first 90 percent of the code accounts for the first 90 percent of the development time...The remaining 10 percent of the code accounts for the other 90 percent of the development time.',
  'Any fool can write code that a computer can understand. Good programmers write code that humans can understand.',
  'Premature optimization is the root of all evil.',
  'Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.'
]

ReactDOM.render(
  <App anecdotes={anecdotes} />,
  document.getElementById('root')
)