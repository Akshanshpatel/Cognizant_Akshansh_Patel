import "./CalculateScore.css";

function CalculateScore({ name, school, total, goal }) {
  const score = ((total / goal) * 100).toFixed(2);

  return (
    <div className="container">
      <h1>Student Details:</h1>

      <div className="details">
        <p>
          <span className="label">Name:</span>{" "}
          <span className="value">{name}</span>
        </p>

        <p>
          <span className="label">School:</span>{" "}
          <span className="value">{school}</span>
        </p>

        <p>
          <span className="label">Total:</span>{" "}
          <span className="value">{total} Marks</span>
        </p>

        <p className="score">
          <span className="label">Score:</span>{" "}
          <span className="value">{score}%</span>
        </p>
      </div>
    </div>
  );
}

export default CalculateScore;