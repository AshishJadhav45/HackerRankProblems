import tkinter as tk
from tkinter import messagebox

def show_message():
    messagebox.showinfo("Message", "Hello, World!")

root = tk.Tk()
root.title("My GUI Program")

button = tk.Button(root, text="Click me!", command=show_message)
button.pack()

root.mainloop()
