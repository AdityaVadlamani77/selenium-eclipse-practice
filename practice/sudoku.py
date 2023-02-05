from kivy.app import App
from kivy.uix.gridlayout import GridLayout
from kivy.uix.textinput import TextInput


class SudokuGame(GridLayout):
    def __init__(self, **kwargs):
        super(SudokuGame, self).__init__(**kwargs)
        self.cols = 9
        self.rows = 9
        self.create_board()

    def create_board(self):
        # create a 9x9 grid of text input widgets
        for i in range(9):
            for j in range(9):
                txt_input = TextInput(input_filter='int', size_hint=(1, 1))
                self.add_widget(txt_input)

    def check_puzzle(self):
        # get the values from the text input widgets and check if the puzzle is valid
        values = []
        for child in self.children:
            values.append(child.text)
        # check if the values form a valid sudoku puzzle
        if is_valid_sudoku(values):
            # puzzle is valid, show a success message
            self.show_message("Congratulations! The puzzle is correct.")
        else:
            # puzzle is not valid, show an error message
            self.show_message("Sorry, the puzzle is not correct.")

    def show_message(self, message):
        # show a message in a pop-up window
        popup = Popup(title='Result', content=Label(text=message), size_hint=(0.5, 0.5))
        popup.open()


class SudokuApp(App):
    def build(self):
        return SudokuGame()


if __name__ == '__main__':
    SudokuApp().run()
