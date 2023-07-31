import express, { Request, Response, NextFunction } from 'express';
import Todo, { ITodo } from '../models/todo';

const router = express.Router();

router.get('/', async (req: Request, res: Response, next: NextFunction) => {
  try {
    const todos: ITodo[] = await Todo.find();
    res.json(todos);
  } catch (error) {
    next(error);
  }
});

router.post('/', async (req: Request, res: Response, next: NextFunction) => {
  try {
    const { title, description } = req.body;
    const todo: ITodo = new Todo({ title, description });
    await todo.save();
    res.status(201).json(todo);
  } catch (error) {
    next(error);
  }
});

export default router;
