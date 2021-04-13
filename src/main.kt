class CarBuilder(
    val model: String?,
    val color: String?,
    val type: String?
) {
    data class Builder(
        var model: String? = null,
        var color: String? = null,
        var type: String? = null
    ) {
        fun model(model: String?) = apply { this.model = model }
        fun color(color: String?) = apply { this.color = color }
        fun type(type: String?) = apply { this.type = type }
        fun build() = CarBuilder(model, color, type)
    }
}

fun main() {
    val car = CarBuilder.Builder()
        .model("Model 1")
        .color("Yellow")
        .type("Premium")
        .build()

    val car1 = CarBuilder.Builder()
        .model("Model 1")
        .color("Yellow")
        .build()

    val car2 = CarBuilder.Builder()
        .model("Model 1")
        .build()
}
