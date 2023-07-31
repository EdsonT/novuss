import express, { Application, Request, Response, NextFunction } from 'express';
import bodyParser from 'body-parser';
import todoRoutes from './routes/todoRoutes';

const app: Application = express();
const PORT = 3000;

// Middleware
app.use(bodyParser.json());

// Routes
app.use('/api/todos', todoRoutes);

// Error handling middleware
app.use((err: Error, req: Request, res: Response, next: NextFunction) => {
  console.error(err.stack);
  res.status(500).json({ message: 'Internal Server Error' });
});

app.listen(PORT, () => {
  console.log(`Server started on http://localhost:${PORT}`);
});
