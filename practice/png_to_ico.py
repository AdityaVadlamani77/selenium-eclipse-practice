import os
from ico import Ico

# directory containing PNG files
directory = 'C:/Users/RJ Aditya/Downloads'

for filename in os.listdir(directory):
    if filename.endswith('.png'):
        # Open image and convert to ICO
        image = Image.open(f'{directory}/{filename}')
        width, height = image.size
        ico_image = Ico()
        ico_image.add_image(image, width, height)
        ico_image.save(f'{directory}/{filename[:-4]}.ico')
