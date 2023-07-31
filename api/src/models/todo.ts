import { Schema, model, Document } from 'mongoose';

export interface ITodo extends Document {
  title: string;
  description: string;
  done: boolean;
}

const TodoSchema: Schema = new Schema({
  title: { type: String, required: true },
  description: { type: String, required: true },
  done: { type: Boolean, default: false },
});

export default model<ITodo>('Todo', TodoSchema);
