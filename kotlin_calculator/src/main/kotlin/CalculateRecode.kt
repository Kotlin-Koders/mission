

class CalculateRecode(var expression: String, var result : String){
    var recode = "$expression = $result"
}

class CalculateRecodes(
    var recodes: MutableList<CalculateRecode> = mutableListOf()
)