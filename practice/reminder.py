def reminder():
    notification.notify(title = "break reminder", message = "drink water, dummy", timeout = 60)
while True:
    reminder()
    time.sleep(1800)