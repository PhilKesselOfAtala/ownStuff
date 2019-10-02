import React, { useState } from 'react';
import ReactDOM from 'react-dom';

const Button = ({onClick, text}) => (
    <button onClick={onClick}>
      {text}
    </button>
  )

const Statistics = ({good, neutral, bad}) => {
    const sum = good + neutral + bad;
    const average = (good - bad) / sum;
    const postiveValues = 100 - (sum - good) / sum * 100;

    console.log(good, neutral, bad);

    if(good === 0 && neutral === 0 && bad === 0) {
        return (
            <p>No feedback given</p>
        )
    }

    return ( 
        <table>
            <tbody>
                <tr>
                    <td>all</td>
                    <td>{sum}</td>
                </tr>
                <tr>
                    <td>average</td>
                    <td>{average}</td>
                </tr>
                <tr>
                    <td>positive</td>
                    <td>{postiveValues}%</td>
                </tr>
            </tbody>    
        </table>
    )
}

const App = () => {
    const [good, setGood] = useState(0)
    const [neutral, setNeutral] = useState(0)
    const [bad, setBad] = useState(0)

    const sum = good + neutral + bad;
    const ave = (good - bad) / sum;
    const postiveValues = 100 - (sum - good) / sum * 100;

    const [clicks, setClicks] = useState({
        good: 0, neutral:0, bad: 0
      })

    const all = clicks.good + clicks.neutral + clicks.bad;
    const average = (clicks.good - clicks.bad) / (clicks.good + clicks.neutral + clicks.bad);
    const positive = 100-(all-clicks.good)/all*100;

    const handleGoodClick = () => {
        setClicks({...clicks, good: clicks.good + 1})
    }

    const handleNeutralClick = () => {
        setClicks({...clicks, neutral: clicks.neutral + 1})
    }
    const handleBadClick = () => {
        setClicks({...clicks, bad: clicks.bad + 1})
    }

    return(
        <div>
            <h1>give feedback</h1>
            <button onClick={() => setGood(good + 1)}>good</button>
            <button onClick={() => setNeutral(neutral + 1)}>neautral</button>
            <button onClick={() => setBad(bad + 1)}>bad</button>
            <h1>statistics - states</h1>
            <p>good {good}</p>
            <p>neutral {neutral}</p>
            <p>bad {bad}</p>
            <p>all {sum}</p>
            <p>average {ave}</p>
            <p>positive {postiveValues}%</p>

            <Button onClick={ () => setGood(good + 1)} text='Good'></Button>
            <Button onClick={ () => setNeutral(neutral + 1)}text="Neutral"></Button>
            <Button onClick={ () => setBad(bad + 1)} text="Bad"></Button>

            <h1>Statistics - component</h1>
            <Statistics good={good} neutral={neutral} bad={bad}/>
            
        </div>
    )
}

ReactDOM.render(<App />, document.getElementById('root'));