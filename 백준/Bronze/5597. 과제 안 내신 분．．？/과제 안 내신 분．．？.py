stu_list = list(range(1,31))

for i in range(28):
    submit = int(input())
    stu_list.remove(submit)

for i in range(len(stu_list)):
    print(stu_list[i])