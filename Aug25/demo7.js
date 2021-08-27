var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
console.log(Color.Blue); //2
var Color2;
(function (Color2) {
    Color2[Color2["Red"] = 100] = "Red";
    Color2[Color2["Green"] = 200] = "Green";
    Color2[Color2["Blue"] = 300] = "Blue";
})(Color2 || (Color2 = {}));
console.log(Color2.Blue); //300
