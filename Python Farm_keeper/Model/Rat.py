from Model.Pet import Pet

class Rat (Pet):

    def __init__(self, name: str, command: str, bday: str):

        super().__init__(name, command, bday)
        self.__name = name
        self.__command = command
        self.bday = bday