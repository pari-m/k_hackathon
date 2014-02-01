from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello World!'

@app.route('/maclist')
def recive_maclist():
    return 'new store'

if __name__ == '__main__':
    app.run(host='0.0.0.0')

