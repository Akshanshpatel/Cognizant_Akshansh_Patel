import { Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import Hol1 from "./pages/Hol1.jsx";
import Hol2 from "./pages/Hol2.jsx";
import Hol3 from "./pages/Hol3";


function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/hol1" element={<Hol1 />} />
      <Route path="/hol2" element={<Hol2 />} />
      <Route path="/hol3" element={<Hol3 />} />
    </Routes>
  );
}

export default App;