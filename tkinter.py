import tkinter as tk

class MyGUI:
    def __init__(self, master):
        self.master = master
        master.title("My GUI")

        self.label = tk.Label(master, text="Hello, World!")
        self.label.pack()

        self.button = tk.Button(master, text="Click me!", command=self.change_text)
        self.button.pack()

    def change_text(self):
        self.label.config(text="Button clicked!")

root = tk.Tk()
my_gui = MyGUI(root)
root.mainloop()
