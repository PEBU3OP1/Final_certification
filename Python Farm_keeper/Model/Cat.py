from Model.Pet import Pet


class Cat(Pet):

    def __init__(self, name, command, bday):
        super().__init__(name, command, bday)
        self.__name = name
        self.__command = command
        self.__bday = bday
        self.class_name = "Cat"



