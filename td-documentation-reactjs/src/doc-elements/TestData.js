const TestData = {

    graphvizColors: {
        a: {
            line: '#123752',
            fill: '#708EA4',
            text: '#eeeeee'
        },
        b: {
            line: '#AA8E39',
            fill: '#FFEAAA',
            text: '#806515',
            inversedText: '#FFEAAA'
        },
        c: {
            line: '#306E12',
            fill: "#519331",
            text: "#ABDD93"
        }
    },

    graphPresentation: {
        slides: [
            {
                ids: ['main', 'parse', 'main->parse'], "content": [
                {
                    "type": "Paragraph",
                    "content": [
                        {
                            "text": "hello",
                            "type": "SimpleText",
                            "content": []
                        }
                    ]
                }
            ]
            },
            {
                ids: ['listen'], "content": [
                {
                    "type": "Paragraph",
                    "content": [
                        {
                            "text": "hello world",
                            "type": "SimpleText",
                            "content": []
                        }
                    ]
                }
            ]
            }
        ]
    },

    svg: '<?xml version="1.0" encoding="UTF-8" standalone="no"?> <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN"  "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"> <!-- Generated by graphviz version 2.38.0 (20140413.2041)  --> <!-- Title: Simple Pages: 1 --> <svg width="188pt" height="191pt"  viewBox="0.00 0.00 188.00 191.00" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"> <g id="graph0" class="graph" transform="scale(1 1) rotate(0) translate(4 187)"> <title>Simple</title> <polygon fill="white" stroke="none" points="-4,4 -4,-187 184,-187 184,4 -4,4"/> <!-- main --> <g id="node1" class="node"><title>main</title> <polygon fill="none" stroke="black" points="63,-146.5 63,-182.5 117,-182.5 117,-146.5 63,-146.5"/> <text text-anchor="middle" x="89.9966" y="-160.3" font-family="Times,serif" font-size="14.00">main [a]</text> </g> <!-- parse --> <g id="node2" class="node"><title>parse</title> <polygon fill="none" stroke="black" points="63,-73.5 63,-109.5 117,-109.5 117,-73.5 63,-73.5"/> <text text-anchor="middle" x="89.769" y="-87.3" font-family="Times,serif" font-size="14.00">parse</text> </g> <!-- main&#45;&gt;parse --> <g id="edge1" class="edge"><title>main&#45;&gt;parse</title> <path fill="none" stroke="black" d="M90,-146.455C90,-146.455 90,-119.59 90,-119.59"/> <polygon fill="black" stroke="black" points="93.5001,-119.59 90,-109.59 86.5001,-119.59 93.5001,-119.59"/> </g> <!-- listen --> <g id="node3" class="node"><title>listen</title> <polygon fill="none" stroke="black" points="0,-0.5 0,-36.5 54,-36.5 54,-0.5 0,-0.5"/> <text text-anchor="middle" x="26.6655" y="-14.3" font-family="Times,serif" font-size="14.00">listen</text> </g> <!-- parse&#45;&gt;listen --> <g id="edge2" class="edge"><title>parse&#45;&gt;listen</title> <path fill="none" stroke="black" d="M81,-73.4602C81,-50.0044 81,-12 81,-12 81,-12 64.3164,-12 64.3164,-12"/> <polygon fill="black" stroke="black" points="64.3164,-8.5001 54.3164,-12 64.3164,-15.5001 64.3164,-8.5001"/> </g> <!-- server --> <g id="node4" class="node"><title>server</title> <polygon fill="none" stroke="black" points="126,-0.5 126,-36.5 180,-36.5 180,-0.5 126,-0.5"/> <text text-anchor="middle" x="152.6" y="-14.3" font-family="Times,serif" font-size="14.00">server</text> </g> <!-- parse&#45;&gt;server --> <g id="edge3" class="edge"><title>parse&#45;&gt;server</title> <path fill="none" stroke="black" d="M99,-73.4112C99,-53.4169 99,-24 99,-24 99,-24 115.684,-24 115.684,-24"/> <polygon fill="black" stroke="black" points="115.684,-27.5001 125.684,-24 115.684,-20.5001 115.684,-27.5001"/> </g> </g> </svg> ',

    documentation:  {
        "docMeta": {
            "id": "preview",
            "type": "User Guide",
            "title": "MDoc",
            "previewEnabled": true
        },
        "page": {
            "type": "Page",
            "content": [
                {
                    "title": "Information Layout",
                    "id": "information-layout",
                    "type": "Section",
                    "content": [
                        {
                            "type": "Paragraph",
                            "content": [
                                {
                                    "text": "The way you layout and flow your information affects how easy it is to comprehend given material.",
                                    "type": "SimpleText"
                                },
                                {
                                    "type": "SoftLineBreak"
                                },
                                {
                                    "text": "Examples of content that easier to consume side by side:",
                                    "type": "SimpleText"
                                }
                            ]
                        },
                        {
                            "bulletMarker": "*",
                            "tight": true,
                            "type": "BulletList",
                            "content": [
                                {
                                    "type": "ListItem",
                                    "content": [
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "Before/After transition",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        }
                                    ]
                                },
                                {
                                    "type": "ListItem",
                                    "content": [
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "Action and its result",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        }
                                    ]
                                },
                                {
                                    "type": "ListItem",
                                    "content": [
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "input and output",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        }
                                    ]
                                }
                            ]
                        }
                    ]
                },
                {
                    "title": "Definition",
                    "id": "definition",
                    "type": "Section",
                    "content": [
                        {
                            "type": "Paragraph",
                            "content": [
                                {
                                    "text": "To define columns layout use ",
                                    "type": "SimpleText"
                                },
                                {
                                    "code": "fenced",
                                    "type": "InlinedCode"
                                },
                                {
                                    "text": " block plugin",
                                    "type": "SimpleText"
                                }
                            ]
                        },
                        {
                            "lang": "",
                            "maxLineLength": 37,
                            "tokens": [
                                {
                                    "type": "text",
                                    "data": "```columns\nleft: \nthis content goes to the left\n\nand can span multiple lines\nright: this content goes to the right\n\nand can span multiple lines\n```\n"
                                }
                            ],
                            "lineNumber": "",
                            "type": "Snippet"
                        },
                        {
                            "columns": [
                                {
                                    "content": [
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "this content goes to the left",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        },
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "and can span multiple lines",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        }
                                    ]
                                },
                                {
                                    "content": [
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "this content goes to the right",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        },
                                        {
                                            "type": "Paragraph",
                                            "content": [
                                                {
                                                    "text": "and can span multiple lines",
                                                    "type": "SimpleText"
                                                }
                                            ]
                                        }
                                    ]
                                }
                            ],
                            "type": "Columns"
                        }
                    ]
                }
            ],
            "tocItem": {
                "sectionTitle": "Features",
                "pageTitle": "Columns",
                "fileName": "columns",
                "dirName": "features",
                "pageSectionIdTitles": [
                    {
                        "title": "Information Layout",
                        "id": "information-layout"
                    },
                    {
                        "title": "Definition",
                        "id": "definition"
                    }
                ]
            }
        }
    }};

export default TestData;