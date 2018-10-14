from tkinter import *
import tkinter

queue = Tk()

#固定窗口大小
queue.geometry("910x600")

top_canvas = Canvas(queue,width = 910, height = 100, bg = "cornsilk").place(x=0, y=0)
left_canvas = Canvas(queue,width = 400, height = 120, bg = "DarkSeaGreen1").place(x= 20, y=120)
right_canvas = Canvas(queue,width = 400, height = 120, bg = "powder blue").place(x= 490, y=120)

queue.title("Queue")
im = Label(queue,
            justify = "left",
            bg = "cornsilk",
            width = 91,
            height = 2,
            padx = 10,
            pady = 5,
            text = "Important",
            font= "Arial 12 bold",
            anchor = "sw")
im.place(x=0,y=0)

explanation = "Individual assessment items must be solely your own work." \
              "While students are encouraged to have high-level conversations about the problems " \
              "they are trying to solve, you must not look at another student's code or copy from it." \
              "The university uses sophisticated anti-collusion measures to" \
              " automatically detect similarity between assignment submissions."

#自动换行是要的
top_content = Label(queue,
            justify = "left",
            bg = "cornsilk",
            width = 130,
            height = 3,
            wraplength = 900,
            padx = 10,
            text = explanation,
            anchor = "w")
top_content.place(x=0,y=50)

#左块
left_title = Label(queue,
            bg = "DarkSeaGreen1",
            width = 15,
            height = 2,
            padx = 10,
            pady = 5,
            text = "Quick Questions",
            font = "Arial 16 bold")
left_title.place(x=220, y=140,anchor = "n")

left_content = Label(queue,
            bg = "DarkSeaGreen1",
            width = 15,
            height = 1,
            padx = 10,
            pady = 5,
            text = "<2 mins with a tutor",
            anchor = "n",
            font = "Arial 9")
left_content.place(x=220, y= 200,anchor = "n")

#右块
right_title = Label(queue,
            bg = "powder blue",
            width = 15,
            height = 2,
            padx = 10,
            pady = 5,
            text = "Long Questions",
            font = "Arial 16 bold")
right_title.place(x=690, y=140,anchor = "n")

right_content = Label(queue,
            bg = "powder blue",
            width = 15,
            height = 1,
            padx = 10,
            pady = 5,
            text = ">2 mins with a tutor",
            anchor = "n",
            font = "Arial 9")
right_content.place(x=690, y=200,anchor = "n")

#左示例
left_content = "Some examples of quick questions:\n" \
               "  • Syntax errors\n" \
               "  • Interpreting error output\n" \
               "  • Assignment/MyPyTutor interpretation\n" \
               "  • MyPyTutor submission issues"
left_examples = Label(queue,
            justify = "left",
            width = 50,
            padx=10,
            pady=5,
            text = left_content,
            anchor="w")
left_examples.place(x=20, y= 250)

#右示例
right_content = "Some examples of long questions:\n" \
                "  • Open ended questions\n" \
                "  • How to start a problem\n" \
                "  • How to improve code\n" \
                "  • Debugging\n" \
                "  • Assignment help"
right_examples = Label(queue,
            justify = "left",
            width = 50,
            padx = 10,
            pady = 5,
            text = right_content,
            anchor = "w")
right_examples.place(x=490,y=250)

#左按钮
b1 = Button(queue,
            text = "Request Quick Help",
            width = 20,
            height = 2,
            bg="DarkSeaGreen1"
            #command = Quick_Help
)
b1.place(x=220, y=370,anchor = "n")

#右按钮
b2 = Button(queue,
            text = "Request Long Help",
            width = 20,
            height = 2,
            bg = "powder blue"
            #command = Long_Help
)

#def Long_help()

b2.place(x=690, y=370,anchor = "n")

#使GUI持续运行
queue.mainloop()

