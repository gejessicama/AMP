myfile = open("json.txt", "r")
content = myfile.read()

new = content.replace("},","}\n")
newfile = open("seq.json","w+")
newfile.write(new)