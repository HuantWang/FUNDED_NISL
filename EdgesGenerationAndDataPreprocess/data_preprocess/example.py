if __name__ == '__main__':
    s = [1, 2, 3, 1, 3, 4, 1, 5, 6, 1, 8, 9, 0]

    i = 0
    while i < s.__len__():
        if s[i] > 2 :
            s.remove(s[i])
            # continue
        i = i + 1

    print(s)
