from flask import Flask, render_template, request, redirect, url_for, send_from_directory
from datetime import datetime

app = Flask(__name__, template_folder="templates")

products = [
    {"id": 1, "name": "Laptop", "price": 1200},
    {"id": 2, "name": "Mouse", "price": 25},
    {"id": 3, "name": "Keyboard", "price": 75},
]

@app.route("/style.css")
def style_css():
    return send_from_directory(app.root_path, "style.css")


@app.route("/", endpoint="home")
def home():
    return render_template(
        "index.html",
        title="Products",
        app_name="Test Shop",
        products=products,
        current_year=datetime.now().year,
    )


@app.route("/add", methods=["GET", "POST"], endpoint="add_product")
def add_product():
    if request.method == "POST":
        name = request.form.get("product_name", "").strip()
        price = request.form.get("product_price", "0").strip()
        if name:
            try:
                price_val = int(price)
            except ValueError:
                price_val = 0
            next_id = max([p["id"] for p in products], default=0) + 1
            products.append({"id": next_id, "name": name, "price": price_val})
        return redirect(url_for("home"))
    return render_template("add_product.html")


@app.route("/delete/<int:product_id>", methods=["GET"], endpoint="delete_product")
def delete_product(product_id: int):
    global products
    products = [p for p in products if p.get("id") != product_id]
    return redirect(url_for("home"))


if __name__ == "__main__":
    app.run(debug=True)
