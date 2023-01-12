package com.example.chessprojectfinal

class BishopCheck(var mainActivity: ChessActivity?) {

    fun check(init_block:ChessBlock, tar_block:ChessBlock) :Boolean{
            if (init_block == tar_block) {
                return false
            }
            if (tar_block.pos.minus(init_block.pos).mod(9) == 0) {
                if (tar_block.chesspiece == null || tar_block.chesspiece!!.color != init_block.chesspiece!!.color) {
                    if (this.mainActivity?.a1 != init_block && ((tar_block.pos - this.mainActivity?.a1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a1?.pos!! >= init_block.pos && this.mainActivity?.a1?.pos!! <= tar_block.pos || this.mainActivity?.a1?.pos!! <= init_block.pos && this.mainActivity?.a1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a1?.chesspiece == null) {
                            if (this.mainActivity?.a1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a2 != init_block && ((tar_block.pos - this.mainActivity?.a2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a2?.pos!! >= init_block.pos && this.mainActivity?.a2?.pos!! <= tar_block.pos || this.mainActivity?.a2?.pos!! <= init_block.pos && this.mainActivity?.a2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a2?.chesspiece == null) {
                            if (this.mainActivity?.a2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a3 != init_block && ((tar_block.pos - this.mainActivity?.a3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a3?.pos!! >= init_block.pos && this.mainActivity?.a3?.pos!! <= tar_block.pos || this.mainActivity?.a3?.pos!! <= init_block.pos && this.mainActivity?.a3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a3?.chesspiece == null) {
                            if (this.mainActivity?.a3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a4 != init_block && ((tar_block.pos - this.mainActivity?.a4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a4?.pos!! >= init_block.pos && this.mainActivity?.a4?.pos!! <= tar_block.pos || this.mainActivity?.a4?.pos!! <= init_block.pos && this.mainActivity?.a4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a4?.chesspiece == null) {
                            if (this.mainActivity?.a4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a5 != init_block && ((tar_block.pos - this.mainActivity?.a5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a5?.pos!! >= init_block.pos && this.mainActivity?.a5?.pos!! <= tar_block.pos || this.mainActivity?.a5?.pos!! <= init_block.pos && this.mainActivity?.a5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a5?.chesspiece == null) {
                            if (this.mainActivity?.a5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a6 != init_block && ((tar_block.pos - this.mainActivity?.a6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a6?.pos!! >= init_block.pos && this.mainActivity?.a6?.pos!! <= tar_block.pos || this.mainActivity?.a6?.pos!! <= init_block.pos && this.mainActivity?.a6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a6?.chesspiece == null) {
                            if (this.mainActivity?.a6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a7 != init_block && ((tar_block.pos - this.mainActivity?.a7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a7?.pos!! >= init_block.pos && this.mainActivity?.a7?.pos!! <= tar_block.pos || this.mainActivity?.a7?.pos!! <= init_block.pos && this.mainActivity?.a7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a7?.chesspiece == null) {
                            if (this.mainActivity?.a7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a8 != init_block && ((tar_block.pos - this.mainActivity?.a8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a8?.pos!! >= init_block.pos && this.mainActivity?.a8?.pos!! <= tar_block.pos || this.mainActivity?.a8?.pos!! <= init_block.pos && this.mainActivity?.a8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a8?.chesspiece == null) {
                            if (this.mainActivity?.a8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.b1 != init_block && ((tar_block.pos - this.mainActivity?.b1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b1?.pos!! >= init_block.pos && this.mainActivity?.b1?.pos!! <= tar_block.pos || this.mainActivity?.b1?.pos!! <= init_block.pos && this.mainActivity?.b1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b1?.chesspiece == null) {
                            if (this.mainActivity?.b1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b2 != init_block && ((tar_block.pos - this.mainActivity?.b2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b2?.pos!! >= init_block.pos && this.mainActivity?.b2?.pos!! <= tar_block.pos || this.mainActivity?.b2?.pos!! <= init_block.pos && this.mainActivity?.b2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b2?.chesspiece == null) {
                            if (this.mainActivity?.b2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b3 != init_block && ((tar_block.pos - this.mainActivity?.b3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b3?.pos!! >= init_block.pos && this.mainActivity?.b3?.pos!! <= tar_block.pos || this.mainActivity?.b3?.pos!! <= init_block.pos && this.mainActivity?.b3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b3?.chesspiece == null) {
                            if (this.mainActivity?.b3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b4 != init_block && ((tar_block.pos - this.mainActivity?.b4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b4?.pos!! >= init_block.pos && this.mainActivity?.b4?.pos!! <= tar_block.pos || this.mainActivity?.b4?.pos!! <= init_block.pos && this.mainActivity?.b4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b4?.chesspiece == null) {
                            if (this.mainActivity?.b4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b5 != init_block && ((tar_block.pos - this.mainActivity?.b5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b5?.pos!! >= init_block.pos && this.mainActivity?.b5?.pos!! <= tar_block.pos || this.mainActivity?.b5?.pos!! <= init_block.pos && this.mainActivity?.b5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b5?.chesspiece == null) {
                            if (this.mainActivity?.b5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b6 != init_block && ((tar_block.pos - this.mainActivity?.b6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b6?.pos!! >= init_block.pos && this.mainActivity?.b6?.pos!! <= tar_block.pos || this.mainActivity?.b6?.pos!! <= init_block.pos && this.mainActivity?.b6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b6?.chesspiece == null) {
                            if (this.mainActivity?.b6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b7 != init_block && ((tar_block.pos - this.mainActivity?.b7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b7?.pos!! >= init_block.pos && this.mainActivity?.b7?.pos!! <= tar_block.pos || this.mainActivity?.b7?.pos!! <= init_block.pos && this.mainActivity?.b7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b7?.chesspiece == null) {
                            if (this.mainActivity?.b7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b8 != init_block && ((tar_block.pos - this.mainActivity?.b8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b8?.pos!! >= init_block.pos && this.mainActivity?.b8?.pos!! <= tar_block.pos || this.mainActivity?.b8?.pos!! <= init_block.pos && this.mainActivity?.b8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b8?.chesspiece == null) {
                            if (this.mainActivity?.b8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.c1 != init_block && ((tar_block.pos - this.mainActivity?.c1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c1?.pos!! >= init_block.pos && this.mainActivity?.c1?.pos!! <= tar_block.pos || this.mainActivity?.c1?.pos!! <= init_block.pos && this.mainActivity?.c1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c1?.chesspiece == null) {
                            if (this.mainActivity?.c1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c2 != init_block && ((tar_block.pos - this.mainActivity?.c2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c2?.pos!! >= init_block.pos && this.mainActivity?.c2?.pos!! <= tar_block.pos || this.mainActivity?.c2?.pos!! <= init_block.pos && this.mainActivity?.c2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c2?.chesspiece == null) {
                            if (this.mainActivity?.c2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c3 != init_block && ((tar_block.pos - this.mainActivity?.c3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c3?.pos!! >= init_block.pos && this.mainActivity?.c3?.pos!! <= tar_block.pos || this.mainActivity?.c3?.pos!! <= init_block.pos && this.mainActivity?.c3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c3?.chesspiece == null) {
                            if (this.mainActivity?.c3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c4 != init_block && ((tar_block.pos - this.mainActivity?.c4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c4?.pos!! >= init_block.pos && this.mainActivity?.c4?.pos!! <= tar_block.pos || this.mainActivity?.c4?.pos!! <= init_block.pos && this.mainActivity?.c4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c4?.chesspiece == null) {
                            if (this.mainActivity?.c4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c5 != init_block && ((tar_block.pos - this.mainActivity?.c5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c5?.pos!! >= init_block.pos && this.mainActivity?.c5?.pos!! <= tar_block.pos || this.mainActivity?.c5?.pos!! <= init_block.pos && this.mainActivity?.c5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c5?.chesspiece == null) {
                            if (this.mainActivity?.c5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c6 != init_block && ((tar_block.pos - this.mainActivity?.c6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c6?.pos!! >= init_block.pos && this.mainActivity?.c6?.pos!! <= tar_block.pos || this.mainActivity?.c6?.pos!! <= init_block.pos && this.mainActivity?.c6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c6?.chesspiece == null) {
                            if (this.mainActivity?.c6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c7 != init_block && ((tar_block.pos - this.mainActivity?.c7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c7?.pos!! >= init_block.pos && this.mainActivity?.c7?.pos!! <= tar_block.pos || this.mainActivity?.c7?.pos!! <= init_block.pos && this.mainActivity?.c7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c7?.chesspiece == null) {
                            if (this.mainActivity?.c7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c8 != init_block && ((tar_block.pos - this.mainActivity?.c8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c8?.pos!! >= init_block.pos && this.mainActivity?.c8?.pos!! <= tar_block.pos || this.mainActivity?.c8?.pos!! <= init_block.pos && this.mainActivity?.c8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c8?.chesspiece == null) {
                            if (this.mainActivity?.c8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.d1 != init_block && ((tar_block.pos - this.mainActivity?.d1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d1?.pos!! >= init_block.pos && this.mainActivity?.d1?.pos!! <= tar_block.pos || this.mainActivity?.d1?.pos!! <= init_block.pos && this.mainActivity?.d1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d1?.chesspiece == null) {
                            if (this.mainActivity?.d1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d2 != init_block && ((tar_block.pos - this.mainActivity?.d2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d2?.pos!! >= init_block.pos && this.mainActivity?.d2?.pos!! <= tar_block.pos || this.mainActivity?.d2?.pos!! <= init_block.pos && this.mainActivity?.d2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d2?.chesspiece == null) {
                            if (this.mainActivity?.d2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d3 != init_block && ((tar_block.pos - this.mainActivity?.d3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d3?.pos!! >= init_block.pos && this.mainActivity?.d3?.pos!! <= tar_block.pos || this.mainActivity?.d3?.pos!! <= init_block.pos && this.mainActivity?.d3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d3?.chesspiece == null) {
                            if (this.mainActivity?.d3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d4 != init_block && ((tar_block.pos - this.mainActivity?.d4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d4?.pos!! >= init_block.pos && this.mainActivity?.d4?.pos!! <= tar_block.pos || this.mainActivity?.d4?.pos!! <= init_block.pos && this.mainActivity?.d4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d4?.chesspiece == null) {
                            if (this.mainActivity?.d4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d5 != init_block && ((tar_block.pos - this.mainActivity?.d5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d5?.pos!! >= init_block.pos && this.mainActivity?.d5?.pos!! <= tar_block.pos || this.mainActivity?.d5?.pos!! <= init_block.pos && this.mainActivity?.d5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d5?.chesspiece == null) {
                            if (this.mainActivity?.d5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d6 != init_block && ((tar_block.pos - this.mainActivity?.d6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d6?.pos!! >= init_block.pos && this.mainActivity?.d6?.pos!! <= tar_block.pos || this.mainActivity?.d6?.pos!! <= init_block.pos && this.mainActivity?.d6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d6?.chesspiece == null) {
                            if (this.mainActivity?.d6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d7 != init_block && ((tar_block.pos - this.mainActivity?.d7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d7?.pos!! >= init_block.pos && this.mainActivity?.d7?.pos!! <= tar_block.pos || this.mainActivity?.d7?.pos!! <= init_block.pos && this.mainActivity?.d7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d7?.chesspiece == null) {
                            if (this.mainActivity?.d7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d8 != init_block && ((tar_block.pos - this.mainActivity?.d8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d8?.pos!! >= init_block.pos && this.mainActivity?.d8?.pos!! <= tar_block.pos || this.mainActivity?.d8?.pos!! <= init_block.pos && this.mainActivity?.d8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d8?.chesspiece == null) {
                            if (this.mainActivity?.d8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.e1 != init_block && ((tar_block.pos - this.mainActivity?.e1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e1?.pos!! >= init_block.pos && this.mainActivity?.e1?.pos!! <= tar_block.pos || this.mainActivity?.e1?.pos!! <= init_block.pos && this.mainActivity?.e1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e1?.chesspiece == null) {
                            if (this.mainActivity?.e1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e2 != init_block && ((tar_block.pos - this.mainActivity?.e2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e2?.pos!! >= init_block.pos && this.mainActivity?.e2?.pos!! <= tar_block.pos || this.mainActivity?.e2?.pos!! <= init_block.pos && this.mainActivity?.e2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e2?.chesspiece == null) {
                            if (this.mainActivity?.e2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e3 != init_block && ((tar_block.pos - this.mainActivity?.e3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e3?.pos!! >= init_block.pos && this.mainActivity?.e3?.pos!! <= tar_block.pos || this.mainActivity?.e3?.pos!! <= init_block.pos && this.mainActivity?.e3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e3?.chesspiece == null) {
                            if (this.mainActivity?.e3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e4 != init_block && ((tar_block.pos - this.mainActivity?.e4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e4?.pos!! >= init_block.pos && this.mainActivity?.e4?.pos!! <= tar_block.pos || this.mainActivity?.e4?.pos!! <= init_block.pos && this.mainActivity?.e4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e4?.chesspiece == null) {
                            if (this.mainActivity?.e4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e5 != init_block && ((tar_block.pos - this.mainActivity?.e5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e5?.pos!! >= init_block.pos && this.mainActivity?.e5?.pos!! <= tar_block.pos || this.mainActivity?.e5?.pos!! <= init_block.pos && this.mainActivity?.e5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e5?.chesspiece == null) {
                            if (this.mainActivity?.e5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e6 != init_block && ((tar_block.pos - this.mainActivity?.e6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e6?.pos!! >= init_block.pos && this.mainActivity?.e6?.pos!! <= tar_block.pos || this.mainActivity?.e6?.pos!! <= init_block.pos && this.mainActivity?.e6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e6?.chesspiece == null) {
                            if (this.mainActivity?.e6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e7 != init_block && ((tar_block.pos - this.mainActivity?.e7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e7?.pos!! >= init_block.pos && this.mainActivity?.e7?.pos!! <= tar_block.pos || this.mainActivity?.e7?.pos!! <= init_block.pos && this.mainActivity?.e7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e7?.chesspiece == null) {
                            if (this.mainActivity?.e7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e8 != init_block && ((tar_block.pos - this.mainActivity?.e8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e8?.pos!! >= init_block.pos && this.mainActivity?.e8?.pos!! <= tar_block.pos || this.mainActivity?.e8?.pos!! <= init_block.pos && this.mainActivity?.e8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e8?.chesspiece == null) {
                            if (this.mainActivity?.e8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.f1 != init_block && ((tar_block.pos - this.mainActivity?.f1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f1?.pos!! >= init_block.pos && this.mainActivity?.f1?.pos!! <= tar_block.pos || this.mainActivity?.f1?.pos!! <= init_block.pos && this.mainActivity?.f1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f1?.chesspiece == null) {
                            if (this.mainActivity?.f1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f2 != init_block && ((tar_block.pos - this.mainActivity?.f2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f2?.pos!! >= init_block.pos && this.mainActivity?.f2?.pos!! <= tar_block.pos || this.mainActivity?.f2?.pos!! <= init_block.pos && this.mainActivity?.f2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f2?.chesspiece == null) {
                            if (this.mainActivity?.f2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f3 != init_block && ((tar_block.pos - this.mainActivity?.f3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f3?.pos!! >= init_block.pos && this.mainActivity?.f3?.pos!! <= tar_block.pos || this.mainActivity?.f3?.pos!! <= init_block.pos && this.mainActivity?.f3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f3?.chesspiece == null) {
                            if (this.mainActivity?.f3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f4 != init_block && ((tar_block.pos - this.mainActivity?.f4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f4?.pos!! >= init_block.pos && this.mainActivity?.f4?.pos!! <= tar_block.pos || this.mainActivity?.f4?.pos!! <= init_block.pos && this.mainActivity?.f4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f4?.chesspiece == null) {
                            if (this.mainActivity?.f4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f5 != init_block && ((tar_block.pos - this.mainActivity?.f5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f5?.pos!! >= init_block.pos && this.mainActivity?.f5?.pos!! <= tar_block.pos || this.mainActivity?.f5?.pos!! <= init_block.pos && this.mainActivity?.f5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f5?.chesspiece == null) {
                            if (this.mainActivity?.f5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f6 != init_block && ((tar_block.pos - this.mainActivity?.f6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f6?.pos!! >= init_block.pos && this.mainActivity?.f6?.pos!! <= tar_block.pos || this.mainActivity?.f6?.pos!! <= init_block.pos && this.mainActivity?.f6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f6?.chesspiece == null) {
                            if (this.mainActivity?.f6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f7 != init_block && ((tar_block.pos - this.mainActivity?.f7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f7?.pos!! >= init_block.pos && this.mainActivity?.f7?.pos!! <= tar_block.pos || this.mainActivity?.f7?.pos!! <= init_block.pos && this.mainActivity?.f7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f7?.chesspiece == null) {
                            if (this.mainActivity?.f7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f8 != init_block && ((tar_block.pos - this.mainActivity?.f8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f8?.pos!! >= init_block.pos && this.mainActivity?.f8?.pos!! <= tar_block.pos || this.mainActivity?.f8?.pos!! <= init_block.pos && this.mainActivity?.f8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f8?.chesspiece == null) {
                            if (this.mainActivity?.f8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.g1 != init_block && ((tar_block.pos - this.mainActivity?.g1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g1?.pos!! >= init_block.pos && this.mainActivity?.g1?.pos!! <= tar_block.pos || this.mainActivity?.g1?.pos!! <= init_block.pos && this.mainActivity?.g1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g1?.chesspiece == null) {
                            if (this.mainActivity?.g1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g2 != init_block && ((tar_block.pos - this.mainActivity?.g2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g2?.pos!! >= init_block.pos && this.mainActivity?.g2?.pos!! <= tar_block.pos || this.mainActivity?.g2?.pos!! <= init_block.pos && this.mainActivity?.g2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g2?.chesspiece == null) {
                            if (this.mainActivity?.g2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g3 != init_block && ((tar_block.pos - this.mainActivity?.g3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g3?.pos!! >= init_block.pos && this.mainActivity?.g3?.pos!! <= tar_block.pos || this.mainActivity?.g3?.pos!! <= init_block.pos && this.mainActivity?.g3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g3?.chesspiece == null) {
                            if (this.mainActivity?.g3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g4 != init_block && ((tar_block.pos - this.mainActivity?.g4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g4?.pos!! >= init_block.pos && this.mainActivity?.g4?.pos!! <= tar_block.pos || this.mainActivity?.g4?.pos!! <= init_block.pos && this.mainActivity?.g4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g4?.chesspiece == null) {
                            if (this.mainActivity?.g4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g5 != init_block && ((tar_block.pos - this.mainActivity?.g5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g5?.pos!! >= init_block.pos && this.mainActivity?.g5?.pos!! <= tar_block.pos || this.mainActivity?.g5?.pos!! <= init_block.pos && this.mainActivity?.g5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g5?.chesspiece == null) {
                            if (this.mainActivity?.g5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g6 != init_block && ((tar_block.pos - this.mainActivity?.g6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g6?.pos!! >= init_block.pos && this.mainActivity?.g6?.pos!! <= tar_block.pos || this.mainActivity?.g6?.pos!! <= init_block.pos && this.mainActivity?.g6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g6?.chesspiece == null) {
                            if (this.mainActivity?.g6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g7 != init_block && ((tar_block.pos - this.mainActivity?.g7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g7?.pos!! >= init_block.pos && this.mainActivity?.g7?.pos!! <= tar_block.pos || this.mainActivity?.g7?.pos!! <= init_block.pos && this.mainActivity?.g7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g7?.chesspiece == null) {
                            if (this.mainActivity?.g7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g8 != init_block && ((tar_block.pos - this.mainActivity?.g8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g8?.pos!! >= init_block.pos && this.mainActivity?.g8?.pos!! <= tar_block.pos || this.mainActivity?.g8?.pos!! <= init_block.pos && this.mainActivity?.g8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g8?.chesspiece == null) {
                            if (this.mainActivity?.g8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.h1 != init_block && ((tar_block.pos - this.mainActivity?.h1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h1?.pos!! >= init_block.pos && this.mainActivity?.h1?.pos!! <= tar_block.pos || this.mainActivity?.h1?.pos!! <= init_block.pos && this.mainActivity?.h1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h1?.chesspiece == null) {
                            if (this.mainActivity?.h1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h2 != init_block && ((tar_block.pos - this.mainActivity?.h2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h2?.pos!! >= init_block.pos && this.mainActivity?.h2?.pos!! <= tar_block.pos || this.mainActivity?.h2?.pos!! <= init_block.pos && this.mainActivity?.h2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h2?.chesspiece == null) {
                            if (this.mainActivity?.h2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h3 != init_block && ((tar_block.pos - this.mainActivity?.h3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h3?.pos!! >= init_block.pos && this.mainActivity?.h3?.pos!! <= tar_block.pos || this.mainActivity?.h3?.pos!! <= init_block.pos && this.mainActivity?.h3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h3?.chesspiece == null) {
                            if (this.mainActivity?.h3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h4 != init_block && ((tar_block.pos - this.mainActivity?.h4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h4?.pos!! >= init_block.pos && this.mainActivity?.h4?.pos!! <= tar_block.pos || this.mainActivity?.h4?.pos!! <= init_block.pos && this.mainActivity?.h4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h4?.chesspiece == null) {
                            if (this.mainActivity?.h4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h5 != init_block && ((tar_block.pos - this.mainActivity?.h5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h5?.pos!! >= init_block.pos && this.mainActivity?.h5?.pos!! <= tar_block.pos || this.mainActivity?.h5?.pos!! <= init_block.pos && this.mainActivity?.h5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h5?.chesspiece == null) {
                            if (this.mainActivity?.h5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h6 != init_block && ((tar_block.pos - this.mainActivity?.h6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h6?.pos!! >= init_block.pos && this.mainActivity?.h6?.pos!! <= tar_block.pos || this.mainActivity?.h6?.pos!! <= init_block.pos && this.mainActivity?.h6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h6?.chesspiece == null) {
                            if (this.mainActivity?.h6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h7 != init_block && ((tar_block.pos - this.mainActivity?.h7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h7?.pos!! >= init_block.pos && this.mainActivity?.h7?.pos!! <= tar_block.pos || this.mainActivity?.h7?.pos!! <= init_block.pos && this.mainActivity?.h7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h7?.chesspiece == null) {
                            if (this.mainActivity?.h7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h8 != init_block && ((tar_block.pos - this.mainActivity?.h8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h8?.pos!! >= init_block.pos && this.mainActivity?.h8?.pos!! <= tar_block.pos || this.mainActivity?.h8?.pos!! <= init_block.pos && this.mainActivity?.h8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h8?.chesspiece == null) {
                            if (this.mainActivity?.h8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    return false
                }
            }
            if (tar_block.pos.minus(init_block.pos).mod(7) == 0) {
                if (tar_block.chesspiece == null || tar_block.chesspiece!!.color != init_block.chesspiece!!.color) {
                    if (this.mainActivity?.a1 != init_block && ((tar_block.pos - this.mainActivity?.a1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a1?.pos!! >= init_block.pos && this.mainActivity?.a1?.pos!! <= tar_block.pos || this.mainActivity?.a1?.pos!! <= init_block.pos && this.mainActivity?.a1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a1?.chesspiece == null) {
                            if (this.mainActivity?.a1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a2 != init_block && ((tar_block.pos - this.mainActivity?.a2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a2?.pos!! >= init_block.pos && this.mainActivity?.a2?.pos!! <= tar_block.pos || this.mainActivity?.a2?.pos!! <= init_block.pos && this.mainActivity?.a2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a2?.chesspiece == null) {
                            if (this.mainActivity?.a2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a3 != init_block && ((tar_block.pos - this.mainActivity?.a3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a3?.pos!! >= init_block.pos && this.mainActivity?.a3?.pos!! <= tar_block.pos || this.mainActivity?.a3?.pos!! <= init_block.pos && this.mainActivity?.a3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a3?.chesspiece == null) {
                            if (this.mainActivity?.a3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a4 != init_block && ((tar_block.pos - this.mainActivity?.a4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a4?.pos!! >= init_block.pos && this.mainActivity?.a4?.pos!! <= tar_block.pos || this.mainActivity?.a4?.pos!! <= init_block.pos && this.mainActivity?.a4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a4?.chesspiece == null) {
                            if (this.mainActivity?.a4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a5 != init_block && ((tar_block.pos - this.mainActivity?.a5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a5?.pos!! >= init_block.pos && this.mainActivity?.a5?.pos!! <= tar_block.pos || this.mainActivity?.a5?.pos!! <= init_block.pos && this.mainActivity?.a5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a5?.chesspiece == null) {
                            if (this.mainActivity?.a5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a6 != init_block && ((tar_block.pos - this.mainActivity?.a6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a6?.pos!! >= init_block.pos && this.mainActivity?.a6?.pos!! <= tar_block.pos || this.mainActivity?.a6?.pos!! <= init_block.pos && this.mainActivity?.a6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a6?.chesspiece == null) {
                            if (this.mainActivity?.a6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a7 != init_block && ((tar_block.pos - this.mainActivity?.a7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a7?.pos!! >= init_block.pos && this.mainActivity?.a7?.pos!! <= tar_block.pos || this.mainActivity?.a7?.pos!! <= init_block.pos && this.mainActivity?.a7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a7?.chesspiece == null) {
                            if (this.mainActivity?.a7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.a8 != init_block && ((tar_block.pos - this.mainActivity?.a8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.a8?.pos!! >= init_block.pos && this.mainActivity?.a8?.pos!! <= tar_block.pos || this.mainActivity?.a8?.pos!! <= init_block.pos && this.mainActivity?.a8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.a8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.a8?.chesspiece == null) {
                            if (this.mainActivity?.a8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.b1 != init_block && ((tar_block.pos - this.mainActivity?.b1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b1?.pos!! >= init_block.pos && this.mainActivity?.b1?.pos!! <= tar_block.pos || this.mainActivity?.b1?.pos!! <= init_block.pos && this.mainActivity?.b1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b1?.chesspiece == null) {
                            if (this.mainActivity?.b1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b2 != init_block && ((tar_block.pos - this.mainActivity?.b2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b2?.pos!! >= init_block.pos && this.mainActivity?.b2?.pos!! <= tar_block.pos || this.mainActivity?.b2?.pos!! <= init_block.pos && this.mainActivity?.b2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b2?.chesspiece == null) {
                            if (this.mainActivity?.b2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b3 != init_block && ((tar_block.pos - this.mainActivity?.b3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b3?.pos!! >= init_block.pos && this.mainActivity?.b3?.pos!! <= tar_block.pos || this.mainActivity?.b3?.pos!! <= init_block.pos && this.mainActivity?.b3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b3?.chesspiece == null) {
                            if (this.mainActivity?.b3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b4 != init_block && ((tar_block.pos - this.mainActivity?.b4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b4?.pos!! >= init_block.pos && this.mainActivity?.b4?.pos!! <= tar_block.pos || this.mainActivity?.b4?.pos!! <= init_block.pos && this.mainActivity?.b4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b4?.chesspiece == null) {
                            if (this.mainActivity?.b4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b5 != init_block && ((tar_block.pos - this.mainActivity?.b5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b5?.pos!! >= init_block.pos && this.mainActivity?.b5?.pos!! <= tar_block.pos || this.mainActivity?.b5?.pos!! <= init_block.pos && this.mainActivity?.b5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b5?.chesspiece == null) {
                            if (this.mainActivity?.b5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b6 != init_block && ((tar_block.pos - this.mainActivity?.b6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b6?.pos!! >= init_block.pos && this.mainActivity?.b6?.pos!! <= tar_block.pos || this.mainActivity?.b6?.pos!! <= init_block.pos && this.mainActivity?.b6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b6?.chesspiece == null) {
                            if (this.mainActivity?.b6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b7 != init_block && ((tar_block.pos - this.mainActivity?.b7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b7?.pos!! >= init_block.pos && this.mainActivity?.b7?.pos!! <= tar_block.pos || this.mainActivity?.b7?.pos!! <= init_block.pos && this.mainActivity?.b7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b7?.chesspiece == null) {
                            if (this.mainActivity?.b7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.b8 != init_block && ((tar_block.pos - this.mainActivity?.b8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.b8?.pos!! >= init_block.pos && this.mainActivity?.b8?.pos!! <= tar_block.pos || this.mainActivity?.b8?.pos!! <= init_block.pos && this.mainActivity?.b8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.b8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.b8?.chesspiece == null) {
                            if (this.mainActivity?.b8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.c1 != init_block && ((tar_block.pos - this.mainActivity?.c1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c1?.pos!! >= init_block.pos && this.mainActivity?.c1?.pos!! <= tar_block.pos || this.mainActivity?.c1?.pos!! <= init_block.pos && this.mainActivity?.c1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c1?.chesspiece == null) {
                            if (this.mainActivity?.c1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c2 != init_block && ((tar_block.pos - this.mainActivity?.c2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c2?.pos!! >= init_block.pos && this.mainActivity?.c2?.pos!! <= tar_block.pos || this.mainActivity?.c2?.pos!! <= init_block.pos && this.mainActivity?.c2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c2?.chesspiece == null) {
                            if (this.mainActivity?.c2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c3 != init_block && ((tar_block.pos - this.mainActivity?.c3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c3?.pos!! >= init_block.pos && this.mainActivity?.c3?.pos!! <= tar_block.pos || this.mainActivity?.c3?.pos!! <= init_block.pos && this.mainActivity?.c3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c3?.chesspiece == null) {
                            if (this.mainActivity?.c3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c4 != init_block && ((tar_block.pos - this.mainActivity?.c4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c4?.pos!! >= init_block.pos && this.mainActivity?.c4?.pos!! <= tar_block.pos || this.mainActivity?.c4?.pos!! <= init_block.pos && this.mainActivity?.c4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c4?.chesspiece == null) {
                            if (this.mainActivity?.c4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c5 != init_block && ((tar_block.pos - this.mainActivity?.c5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c5?.pos!! >= init_block.pos && this.mainActivity?.c5?.pos!! <= tar_block.pos || this.mainActivity?.c5?.pos!! <= init_block.pos && this.mainActivity?.c5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c5?.chesspiece == null) {
                            if (this.mainActivity?.c5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c6 != init_block && ((tar_block.pos - this.mainActivity?.c6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c6?.pos!! >= init_block.pos && this.mainActivity?.c6?.pos!! <= tar_block.pos || this.mainActivity?.c6?.pos!! <= init_block.pos && this.mainActivity?.c6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c6?.chesspiece == null) {
                            if (this.mainActivity?.c6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c7 != init_block && ((tar_block.pos - this.mainActivity?.c7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c7?.pos!! >= init_block.pos && this.mainActivity?.c7?.pos!! <= tar_block.pos || this.mainActivity?.c7?.pos!! <= init_block.pos && this.mainActivity?.c7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c7?.chesspiece == null) {
                            if (this.mainActivity?.c7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.c8 != init_block && ((tar_block.pos - this.mainActivity?.c8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.c8?.pos!! >= init_block.pos && this.mainActivity?.c8?.pos!! <= tar_block.pos || this.mainActivity?.c8?.pos!! <= init_block.pos && this.mainActivity?.c8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.c8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.c8?.chesspiece == null) {
                            if (this.mainActivity?.c8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.d1 != init_block && ((tar_block.pos - this.mainActivity?.d1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d1?.pos!! >= init_block.pos && this.mainActivity?.d1?.pos!! <= tar_block.pos || this.mainActivity?.d1?.pos!! <= init_block.pos && this.mainActivity?.d1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d1?.chesspiece == null) {
                            if (this.mainActivity?.d1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d2 != init_block && ((tar_block.pos - this.mainActivity?.d2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d2?.pos!! >= init_block.pos && this.mainActivity?.d2?.pos!! <= tar_block.pos || this.mainActivity?.d2?.pos!! <= init_block.pos && this.mainActivity?.d2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d2?.chesspiece == null) {
                            if (this.mainActivity?.d2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d3 != init_block && ((tar_block.pos - this.mainActivity?.d3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d3?.pos!! >= init_block.pos && this.mainActivity?.d3?.pos!! <= tar_block.pos || this.mainActivity?.d3?.pos!! <= init_block.pos && this.mainActivity?.d3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d3?.chesspiece == null) {
                            if (this.mainActivity?.d3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d4 != init_block && ((tar_block.pos - this.mainActivity?.d4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d4?.pos!! >= init_block.pos && this.mainActivity?.d4?.pos!! <= tar_block.pos || this.mainActivity?.d4?.pos!! <= init_block.pos && this.mainActivity?.d4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d4?.chesspiece == null) {
                            if (this.mainActivity?.d4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d5 != init_block && ((tar_block.pos - this.mainActivity?.d5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d5?.pos!! >= init_block.pos && this.mainActivity?.d5?.pos!! <= tar_block.pos || this.mainActivity?.d5?.pos!! <= init_block.pos && this.mainActivity?.d5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d5?.chesspiece == null) {
                            if (this.mainActivity?.d5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d6 != init_block && ((tar_block.pos - this.mainActivity?.d6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d6?.pos!! >= init_block.pos && this.mainActivity?.d6?.pos!! <= tar_block.pos || this.mainActivity?.d6?.pos!! <= init_block.pos && this.mainActivity?.d6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d6?.chesspiece == null) {
                            if (this.mainActivity?.d6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d7 != init_block && ((tar_block.pos - this.mainActivity?.d7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d7?.pos!! >= init_block.pos && this.mainActivity?.d7?.pos!! <= tar_block.pos || this.mainActivity?.d7?.pos!! <= init_block.pos && this.mainActivity?.d7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d7?.chesspiece == null) {
                            if (this.mainActivity?.d7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.d8 != init_block && ((tar_block.pos - this.mainActivity?.d8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.d8?.pos!! >= init_block.pos && this.mainActivity?.d8?.pos!! <= tar_block.pos || this.mainActivity?.d8?.pos!! <= init_block.pos && this.mainActivity?.d8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.d8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.d8?.chesspiece == null) {
                            if (this.mainActivity?.d8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.e1 != init_block && ((tar_block.pos - this.mainActivity?.e1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e1?.pos!! >= init_block.pos && this.mainActivity?.e1?.pos!! <= tar_block.pos || this.mainActivity?.e1?.pos!! <= init_block.pos && this.mainActivity?.e1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e1?.chesspiece == null) {
                            if (this.mainActivity?.e1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e2 != init_block && ((tar_block.pos - this.mainActivity?.e2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e2?.pos!! >= init_block.pos && this.mainActivity?.e2?.pos!! <= tar_block.pos || this.mainActivity?.e2?.pos!! <= init_block.pos && this.mainActivity?.e2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e2?.chesspiece == null) {
                            if (this.mainActivity?.e2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e3 != init_block && ((tar_block.pos - this.mainActivity?.e3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e3?.pos!! >= init_block.pos && this.mainActivity?.e3?.pos!! <= tar_block.pos || this.mainActivity?.e3?.pos!! <= init_block.pos && this.mainActivity?.e3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e3?.chesspiece == null) {
                            if (this.mainActivity?.e3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e4 != init_block && ((tar_block.pos - this.mainActivity?.e4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e4?.pos!! >= init_block.pos && this.mainActivity?.e4?.pos!! <= tar_block.pos || this.mainActivity?.e4?.pos!! <= init_block.pos && this.mainActivity?.e4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e4?.chesspiece == null) {
                            if (this.mainActivity?.e4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e5 != init_block && ((tar_block.pos - this.mainActivity?.e5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e5?.pos!! >= init_block.pos && this.mainActivity?.e5?.pos!! <= tar_block.pos || this.mainActivity?.e5?.pos!! <= init_block.pos && this.mainActivity?.e5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e5?.chesspiece == null) {
                            if (this.mainActivity?.e5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e6 != init_block && ((tar_block.pos - this.mainActivity?.e6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e6?.pos!! >= init_block.pos && this.mainActivity?.e6?.pos!! <= tar_block.pos || this.mainActivity?.e6?.pos!! <= init_block.pos && this.mainActivity?.e6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e6?.chesspiece == null) {
                            if (this.mainActivity?.e6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e7 != init_block && ((tar_block.pos - this.mainActivity?.e7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e7?.pos!! >= init_block.pos && this.mainActivity?.e7?.pos!! <= tar_block.pos || this.mainActivity?.e7?.pos!! <= init_block.pos && this.mainActivity?.e7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e7?.chesspiece == null) {
                            if (this.mainActivity?.e7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.e8 != init_block && ((tar_block.pos - this.mainActivity?.e8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.e8?.pos!! >= init_block.pos && this.mainActivity?.e8?.pos!! <= tar_block.pos || this.mainActivity?.e8?.pos!! <= init_block.pos && this.mainActivity?.e8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.e8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.e8?.chesspiece == null) {
                            if (this.mainActivity?.e8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.f1 != init_block && ((tar_block.pos - this.mainActivity?.f1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f1?.pos!! >= init_block.pos && this.mainActivity?.f1?.pos!! <= tar_block.pos || this.mainActivity?.f1?.pos!! <= init_block.pos && this.mainActivity?.f1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f1?.chesspiece == null) {
                            if (this.mainActivity?.f1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f2 != init_block && ((tar_block.pos - this.mainActivity?.f2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f2?.pos!! >= init_block.pos && this.mainActivity?.f2?.pos!! <= tar_block.pos || this.mainActivity?.f2?.pos!! <= init_block.pos && this.mainActivity?.f2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f2?.chesspiece == null) {
                            if (this.mainActivity?.f2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f3 != init_block && ((tar_block.pos - this.mainActivity?.f3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f3?.pos!! >= init_block.pos && this.mainActivity?.f3?.pos!! <= tar_block.pos || this.mainActivity?.f3?.pos!! <= init_block.pos && this.mainActivity?.f3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f3?.chesspiece == null) {
                            if (this.mainActivity?.f3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f4 != init_block && ((tar_block.pos - this.mainActivity?.f4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f4?.pos!! >= init_block.pos && this.mainActivity?.f4?.pos!! <= tar_block.pos || this.mainActivity?.f4?.pos!! <= init_block.pos && this.mainActivity?.f4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f4?.chesspiece == null) {
                            if (this.mainActivity?.f4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f5 != init_block && ((tar_block.pos - this.mainActivity?.f5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f5?.pos!! >= init_block.pos && this.mainActivity?.f5?.pos!! <= tar_block.pos || this.mainActivity?.f5?.pos!! <= init_block.pos && this.mainActivity?.f5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f5?.chesspiece == null) {
                            if (this.mainActivity?.f5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f6 != init_block && ((tar_block.pos - this.mainActivity?.f6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f6?.pos!! >= init_block.pos && this.mainActivity?.f6?.pos!! <= tar_block.pos || this.mainActivity?.f6?.pos!! <= init_block.pos && this.mainActivity?.f6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f6?.chesspiece == null) {
                            if (this.mainActivity?.f6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f7 != init_block && ((tar_block.pos - this.mainActivity?.f7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f7?.pos!! >= init_block.pos && this.mainActivity?.f7?.pos!! <= tar_block.pos || this.mainActivity?.f7?.pos!! <= init_block.pos && this.mainActivity?.f7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f7?.chesspiece == null) {
                            if (this.mainActivity?.f7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.f8 != init_block && ((tar_block.pos - this.mainActivity?.f8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.f8?.pos!! >= init_block.pos && this.mainActivity?.f8?.pos!! <= tar_block.pos || this.mainActivity?.f8?.pos!! <= init_block.pos && this.mainActivity?.f8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.f8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.f8?.chesspiece == null) {
                            if (this.mainActivity?.f8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.g1 != init_block && ((tar_block.pos - this.mainActivity?.g1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g1?.pos!! >= init_block.pos && this.mainActivity?.g1?.pos!! <= tar_block.pos || this.mainActivity?.g1?.pos!! <= init_block.pos && this.mainActivity?.g1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g1?.chesspiece == null) {
                            if (this.mainActivity?.g1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g2 != init_block && ((tar_block.pos - this.mainActivity?.g2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g2?.pos!! >= init_block.pos && this.mainActivity?.g2?.pos!! <= tar_block.pos || this.mainActivity?.g2?.pos!! <= init_block.pos && this.mainActivity?.g2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g2?.chesspiece == null) {
                            if (this.mainActivity?.g2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g3 != init_block && ((tar_block.pos - this.mainActivity?.g3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g3?.pos!! >= init_block.pos && this.mainActivity?.g3?.pos!! <= tar_block.pos || this.mainActivity?.g3?.pos!! <= init_block.pos && this.mainActivity?.g3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g3?.chesspiece == null) {
                            if (this.mainActivity?.g3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g4 != init_block && ((tar_block.pos - this.mainActivity?.g4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g4?.pos!! >= init_block.pos && this.mainActivity?.g4?.pos!! <= tar_block.pos || this.mainActivity?.g4?.pos!! <= init_block.pos && this.mainActivity?.g4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g4?.chesspiece == null) {
                            if (this.mainActivity?.g4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g5 != init_block && ((tar_block.pos - this.mainActivity?.g5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g5?.pos!! >= init_block.pos && this.mainActivity?.g5?.pos!! <= tar_block.pos || this.mainActivity?.g5?.pos!! <= init_block.pos && this.mainActivity?.g5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g5?.chesspiece == null) {
                            if (this.mainActivity?.g5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g6 != init_block && ((tar_block.pos - this.mainActivity?.g6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g6?.pos!! >= init_block.pos && this.mainActivity?.g6?.pos!! <= tar_block.pos || this.mainActivity?.g6?.pos!! <= init_block.pos && this.mainActivity?.g6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g6?.chesspiece == null) {
                            if (this.mainActivity?.g6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g7 != init_block && ((tar_block.pos - this.mainActivity?.g7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g7?.pos!! >= init_block.pos && this.mainActivity?.g7?.pos!! <= tar_block.pos || this.mainActivity?.g7?.pos!! <= init_block.pos && this.mainActivity?.g7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g7?.chesspiece == null) {
                            if (this.mainActivity?.g7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.g8 != init_block && ((tar_block.pos - this.mainActivity?.g8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.g8?.pos!! >= init_block.pos && this.mainActivity?.g8?.pos!! <= tar_block.pos || this.mainActivity?.g8?.pos!! <= init_block.pos && this.mainActivity?.g8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.g8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.g8?.chesspiece == null) {
                            if (this.mainActivity?.g8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }

                    if (this.mainActivity?.h1 != init_block && ((tar_block.pos - this.mainActivity?.h1!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h1?.pos!! >= init_block.pos && this.mainActivity?.h1?.pos!! <= tar_block.pos || this.mainActivity?.h1?.pos!! <= init_block.pos && this.mainActivity?.h1?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h1 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h1?.chesspiece == null) {
                            if (this.mainActivity?.h1 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h2 != init_block && ((tar_block.pos - this.mainActivity?.h2!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h2?.pos!! >= init_block.pos && this.mainActivity?.h2?.pos!! <= tar_block.pos || this.mainActivity?.h2?.pos!! <= init_block.pos && this.mainActivity?.h2?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h2 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h2?.chesspiece == null) {
                            if (this.mainActivity?.h2 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h3 != init_block && ((tar_block.pos - this.mainActivity?.h3!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h3?.pos!! >= init_block.pos && this.mainActivity?.h3?.pos!! <= tar_block.pos || this.mainActivity?.h3?.pos!! <= init_block.pos && this.mainActivity?.h3?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h3 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h3?.chesspiece == null) {
                            if (this.mainActivity?.h3 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h4 != init_block && ((tar_block.pos - this.mainActivity?.h4!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h4?.pos!! >= init_block.pos && this.mainActivity?.h4?.pos!! <= tar_block.pos || this.mainActivity?.h4?.pos!! <= init_block.pos && this.mainActivity?.h4?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h4 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h4?.chesspiece == null) {
                            if (this.mainActivity?.h4 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h5 != init_block && ((tar_block.pos - this.mainActivity?.h5!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h5?.pos!! >= init_block.pos && this.mainActivity?.h5?.pos!! <= tar_block.pos || this.mainActivity?.h5?.pos!! <= init_block.pos && this.mainActivity?.h5?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h5 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h5?.chesspiece == null) {
                            if (this.mainActivity?.h5 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h6 != init_block && ((tar_block.pos - this.mainActivity?.h6!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h6?.pos!! >= init_block.pos && this.mainActivity?.h6?.pos!! <= tar_block.pos || this.mainActivity?.h6?.pos!! <= init_block.pos && this.mainActivity?.h6?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h6 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h6?.chesspiece == null) {
                            if (this.mainActivity?.h6 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h7 != init_block && ((tar_block.pos - this.mainActivity?.h7!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h7?.pos!! >= init_block.pos && this.mainActivity?.h7?.pos!! <= tar_block.pos || this.mainActivity?.h7?.pos!! <= init_block.pos && this.mainActivity?.h7?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h7 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h7?.chesspiece == null) {
                            if (this.mainActivity?.h7 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    if (this.mainActivity?.h8 != init_block && ((tar_block.pos - this.mainActivity?.h8!!.pos).mod(
                            9
                        ) == 0) && (this.mainActivity?.h8?.pos!! >= init_block.pos && this.mainActivity?.h8?.pos!! <= tar_block.pos || this.mainActivity?.h8?.pos!! <= init_block.pos && this.mainActivity?.h8?.pos!! >= tar_block.pos)
                    ) {
                        if (this.mainActivity?.h8 == tar_block && tar_block.chesspiece?.color != init_block.chesspiece?.color) {
                            return true
                        }
                        if (this.mainActivity?.h8?.chesspiece == null) {
                            if (this.mainActivity?.h8 == tar_block) {
                                return true
                            }
                        } else
                            return false
                    }
                    return false
                }
            }
            return false
        }
    }
