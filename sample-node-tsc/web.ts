import express from "express";

const app = express();

app.get('/', (req, res) => {
  res.send('hello, TS world');
});

app.listen(process.env.PORT || 8080);
