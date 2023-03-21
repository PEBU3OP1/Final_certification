from Database.Farm_db import Farm_db



class View_Console_Menu():


    def start(self):
        while True:
            print("""
        -  1: Полный список животных
        -  2: Завести в базу новое животное
        -  3: Что умеет животное
        -  4: Дрессировать животное
        -  5: Найти инф по имени
        -  6: Изменить данные
        -  7: Удалить животное
        -  8: Выход
           """)

            key = input("ВВедите цифру: ")
            if key == "1":
                Farm_db.getAll()

            if key == "2":
                print("2")

            if key == "3":
                print("3")

            if key == "4":
                print("4")

            if key == "5":
                print("5")

            if key == "6":
                print("6")

            if key == "7":
                to_del = input("Номер Id для удаления:")
                Farm_db.delete(to_del)

            if key == "8":
                print("8")
                break
