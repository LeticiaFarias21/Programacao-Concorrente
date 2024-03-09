from matrix import generate_matrix, max, min
import sys
import time
import threading as th


def thread_function(size):
    print(f"size: {size}")
    global buffer
    buffer = (generate_matrix(size))

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Use: python3 find.py <size>")
        sys.exit(1)

    try:
        size = int(sys.argv[1])
    except ValueError:
        print("The size of the matrix must be an integer.")
        sys.exit(1)

    size = int(sys.argv[1])
    matrix = th.Thread(target=thread_function(size))
    matrix.start()
    matrix.join()
    print(f'Max value: {max(buffer)}')
    print(f'Min value: {min(buffer)}')
