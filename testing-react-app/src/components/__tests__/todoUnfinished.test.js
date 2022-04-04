import { render, screen, cleanup } from '@testing-library/react';
import renderer from 'react-test-renderer';
import Todo from '../todo';
import {loadFeature, defineFeature } from 'jest-cucumber';

const feature = loadFeature('./src/components/__tests__/features/incomplete.feature')

defineFeature(feature, (test) => {
    let todo;
    let todoElement;

    afterEach(() => {
        cleanup();
    })

    test('Unfinished task', ({ given, then, and }) => {
        todo = { id: 1, title: 'wash dishes', completed: false, };

        given('An initialized rendered component', () => {
            render(<Todo todo={todo}/>);
            todoElement = screen.getByTestId('todo-1');
            expect(todoElement).toBeInTheDocument();
            expect(todoElement).toHaveTextContent('wash dishes');
        });

        then('There is an unfinished a task', () => {
            expect(todo).toHaveProperty('completed', false)
        });

        and('It has NOT a strike tag', () => {
            expect(todoElement).not.toContainHTML('strike');
        });
    });
})

