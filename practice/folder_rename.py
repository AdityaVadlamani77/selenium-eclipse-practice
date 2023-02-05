import os

# Set the directory where the folders are located
directory = "G:/Games"

# Get a list of all the items in the directory
items = os.listdir(directory)

# Loop through the items and rename only the folders that match the desired pattern
for item in items:
    item_path = os.path.join(directory, item)
    if os.path.isdir(item_path):
        # Check if the folder name starts with "c"
        if item.startswith("c"):
            # Check if the folder name is not already in "Chapter xxx" format
            if not item.startswith("Chapter "):
                # Extract the number from the folder name
                number = item[1:]
                # Build the new name
                new_name = "Chapter " + number
                # Rename the folder
                old_name = item_path
                new_name = os.path.join(directory, new_name)
                os.rename(old_name, new_name)

print("Folders renamed!")
