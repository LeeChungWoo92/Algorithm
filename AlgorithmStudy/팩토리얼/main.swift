//
//  main.swift
//  AlgorithmStudy
//
//  Created by lcw on 2021/08/03.
//

import Foundation

var input = Int(readLine()!)!


func recursive(num: Int) -> Int{
    if num == 0 {
        return 1
    }
    return num * recursive(num: num-1)
}

print(recursive(num: input))
