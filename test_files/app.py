from flask import Flask, render_template
app = Flask(__name__)
products = [{"name": "Laptop", "price": 1200}]