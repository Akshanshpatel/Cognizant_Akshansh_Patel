import { Link } from "react-router-dom";

function Home() {
  return (
    <div>
      <h1>Welcome to React HOL</h1>

      <Link to="/hol1">
        <button>HOL 1 Answers</button>
      </Link>

      <br /><br />

      <Link to="/hol2">
        <button>HOL 2 Answers</button>
      </Link>

      <br /><br />

      <Link to="/hol3">
        <button>HOL 3 - Score Calculator</button>
      </Link>
    </div>
  );
}

export default Home;