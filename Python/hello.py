from collections import deque

class State:
    def __init__(self, board, goal, depth=0):
        self.board = board
        self.depth = depth
        self.goal = goal

    def get_new_board(self, i1, i2, depth):
        new_board = self.board[:]
        new_board[i1], new_board[i2] = new_board[i2], new_board[i1]
        return State(new_board, self.goal, depth)

    def expand(self, depth):
        result = []
        i = self.board.index(0)  # 숫자 0(빈칸)의 위치를 찾는다.
        if not i in [0, 3, 6]:  # LEFT
            result.append(self.get_new_board(i, i-1, depth))
        if not i in [0, 1, 2]:  # UP
            result.append(self.get_new_board(i, i-3, depth))
        if not i in [2, 5, 8]:  # RIGHT
            result.append(self.get_new_board(i, i+1, depth))
        if not i in [6, 7, 8]:  # DOWN
            result.append(self.get_new_board(i, i+3, depth))
        return result

    def __str__(self):
        return str(self.board[:3]) + "\n" +\
               str(self.board[3:6]) + "\n" +\
               str(self.board[6:]) + "\n" +\
               "------------------"

    def __eq__(self, other):
        return self.board == other.board

# 초기 상태와 목표 상태
puzzle = [2, 8, 3, 1, 6, 4, 7, 0, 5]
goal = [1, 2, 3, 8, 0, 4, 7, 6, 5]

open_queue = deque()
open_queue.append(State(puzzle, goal))
closed_queue = []

while open_queue:
    current = open_queue.popleft()
    print(current)
    if current.board == goal:
        print("탐색 성공")
        break
    closed_queue.append(current)
    for state in current.expand(current.depth + 1):
        if state not in closed_queue and state not in open_queue:
            open_queue.append(state)
