import { render, screen, cleanup } from '@testing-library/react';
import renderer from 'react-test-renderer';
import Todo from '../todo';
import {loadFeature, defineFeature } from 'jest-cucumber';

const feature = loadFeature('./src/components/__tests__/features/completed.feature')

defineFeature(feature, (test) => {
    let todo;
    let todoElement;
    let tree;

    afterEach(() => {
        cleanup();
    })

    test('Finished task', ({ given, then, and }) => {
        todo = { id: 2, title: 'wash car', completed: true, };

        given('An initialized rendered component', () => {
            render(<Todo todo={todo}/>);
            todoElement = screen.getByTestId('todo-2');
            expect(todoElement).toBeInTheDocument();
            expect(todoElement).toHaveTextContent('wash car');
        });

        then('There is a finished a task', () => {
            expect(todo).toHaveProperty('completed', true)
        });

        and('It has a strike tag', () => {
            expect(todoElement).toContainHTML('strike');
        });
    });
})

