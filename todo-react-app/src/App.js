import React from 'react';
import Todo from './Todo';
import AddTodo from "./AddTodo.js"
import {Paper, List, Container } from "@material-ui/core";
import './App.css';

class App extends React.Component{
  constructor(props) {
    super(props);
    this.state ={
      items: [
        { id:"0", title: "Hello worold1", done: true},
        { id:"1", title: "Hello worold2", done: false},
      ],
    };
  }
//함수 추가
  add =(item) => {
    const thisItems = this.state.items;
    item.id = "ID-" + thisItems.length;// key를 위한 id 추가
    item.done = false; //done초기화
    thisItems.push(item); //리스트에 아이템 추가
    this.setState({ items : thisItems}); //업데이트는 반드시 this.setState로해야함
    console.log("items:",this.state.items);
  }
  render(){
    var todoItems = this.state.items.length > 0 && (
      <Paper style={{margin: 20}}>
        <List>
          {this.state.items.map((item, idx)=> (
            <Todo item={item} key={item.id} />
          ))}
        </List>
      </Paper>
    );
//함수 연결
    return (
      <div className="App">
        <Container maxWidth="md">
          <AddTodo add={this.add} />
          <div className="TodoList">{todoItems}</div>
        </Container>
      </div>
    );
  }
}
export default App;